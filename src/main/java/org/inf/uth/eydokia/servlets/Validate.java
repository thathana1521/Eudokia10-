/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package org.inf.uth.eydokia.servlets;

import java.util.Hashtable;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;


public class Validate
 {
    private static Hashtable env;
    private  static Attributes atr;
    private  boolean error;
    private static DirContext ctx;
    
     public static boolean checkUser(String username,String pass) 
     {
      boolean st;
      try {
            // Set up ldap environment
            env = new Hashtable(11);
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://ldap.uth.gr:389/");
            env.put(Context.SECURITY_PRINCIPAL, "uid=" + username + ", ou=People, dc=uth,dc=gr");
            env.put(Context.SECURITY_AUTHENTICATION, "simple");
            env.put(Context.SECURITY_CREDENTIALS, pass);
            
            ctx = new InitialDirContext(env);
            
            atr = ctx.getAttributes("uid=" + username + ", ou=People, dc=uth, dc=gr");
            
            ctx.close();
            st= true;

        } catch (AuthenticationException ex) {
              st = false;
        }catch (NamingException ex) {
             st=false;
        }
      
   
         return st;                 
  }   
    
}