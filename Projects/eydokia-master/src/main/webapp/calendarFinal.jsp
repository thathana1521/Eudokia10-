<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<head>
   <meta http-equiv="Content-type" content="text/html; charset=utf-8">
   <title>Mini calendar in the scheduler header</title>

   <script src="codebase/dhtmlxscheduler.js" type="text/javascript" charset="utf-8"></script>
   <link rel="stylesheet" href="codebase/dhtmlxscheduler.css" type="text/css" media="screen" title="no title" charset="utf-8">

	<script src="codebase/ext/dhtmlxscheduler_minical.js" type="text/javascript" charset="utf-8"></script>
        <script src="codebase/ext/dhtmlxscheduler_recurring.js" type="text/javascript" charset="utf-8"></script>
   
<style type="text/css" media="screen">
   html, body{
      margin:0px;
      padding:0px;
      height:100%;
      overflow:hidden;
   }   
</style>

<script type="text/javascript" charset="utf-8">
	function init() {
		scheduler.config.multi_day = true;
		
		scheduler.config.xml_date="%Y-%m-%d %H:%i";
		scheduler.init('scheduler_here',new Date(),"week");
                
                scheduler.config.lightbox.sections = [
    {name:"description", height:130, map_to:"text", type:"textarea" , focus:true},
    {name:"recurring", type:"recurring", map_to:"rec_type", button:"recurring", 
      form:"my_recurring_form"},
    {name:"time", height:72, type:"time", map_to:"auto"}
];
                
	}
	
	function show_minical(){
		if (scheduler.isCalendarVisible())
			scheduler.destroyCalendar();
		else
			scheduler.renderCalendar({
				position:"dhx_minical_icon",
				date:scheduler._date,
				navigation:true,
				handler:function(date,calendar){
					scheduler.setCurrentView(date);
					scheduler.destroyCalendar()
				}
			});
	}
</script>
</head>
<body onload="init();">
    <%@ include file="/WEB-INF/jspf/menu.jspf" %>
        <%@ include file="/WEB-INF/jspf/header.jspf" %>
   <div id="scheduler_here" class="dhx_cal_container" style='width:100%; height:100%;'>
      <div class="dhx_cal_navline">
         <div class="dhx_cal_prev_button">&nbsp;</div>
         <div class="dhx_cal_next_button">&nbsp;</div>
         <div class="dhx_cal_today_button"></div>
         <div class="dhx_cal_date"></div>
         <div class="dhx_minical_icon" id="dhx_minical_icon" onclick="show_minical()">&nbsp;</div>
         <div class="dhx_cal_tab" name="day_tab" style="right:204px;"></div>
         <div class="dhx_cal_tab" name="week_tab" style="right:140px;"></div>
         <div class="dhx_cal_tab" name="month_tab" style="right:76px;"></div>
      </div>
      <div class="dhx_cal_header">
      </div>
      <div class="dhx_cal_data">
      </div>
   </div>
   <script>
       scheduler.init('scheduler_here', new Date(), "month");
       scheduler.load("/calendarNew");
       
       var dp = new dataProcessor("/calendarNew");
       dp.init(scheduler);
       </script>
</body>