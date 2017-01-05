var year = new Date().getFullYear();
  var month = new Date().getMonth();
  var day = new Date().getDate();

  var eventData1 = {
    options: {
      timeslotsPerHour: 4,
      timeslotHeight: 20
    },
    events : [
       {'id':1, 'start': new Date(year, month, day, 12), 'end': new Date(year, month, day, 13, 30),'title':'Lunch with Mike'},
       {'id':2, 'start': new Date(year, month, day, 14), 'end': new Date(year, month, day, 14, 45),'title':'Dev Meeting'},
       {'id':3, 'start': new Date(year, month, day + 1, 18), 'end': new Date(year, month, day + 1, 18, 45),'title':'Hair cut'},
       {'id':4, 'start': new Date(year, month, day - 1, 8), 'end': new Date(year, month, day - 1, 9, 30),'title':'Team breakfast'},
       {'id':5, 'start': new Date(year, month, day + 1, 14), 'end': new Date(year, month, day + 1, 15),'title':'Product showcase'}
    ]
  };

  var eventData2 = {
    options: {
      timeslotsPerHour: 3,
      timeslotHeight: 30
    },
    events : [
       {'id':1, 'start': new Date(year, month, day, 12), 'end': new Date(year, month, day, 13, 00),'title':'Lunch with Sarah'},
       {'id':2, 'start': new Date(year, month, day, 14), 'end': new Date(year, month, day, 14, 40),'title':'Team Meeting'},
       {'id':3, 'start': new Date(year, month, day + 1, 18), 'end': new Date(year, month, day + 1, 18, 40),'title':'Meet with Joe'},
       {'id':4, 'start': new Date(year, month, day - 1, 8), 'end': new Date(year, month, day - 1, 9, 20),'title':'Coffee with Alison'},
       {'id':5, 'start': new Date(year, month, day + 1, 14), 'end': new Date(year, month, day + 1, 15),'title':'Product showcase'}
    ]
  };


        // data set 3 : using event delete features
  var eventData3 = {
    options: {
      allowEventDelete: true,
      eventDelete: function(calEvent, element, dayFreeBusyManager, calendar, clickEvent) {
        if (confirm('You want to delete this event?')) {
          calendar.weekCalendar('removeEvent',calEvent.id);
        }
      },
      deletable: function(calEvent, element) {
        return calEvent.start > Date.today();
      }
    },
    events : [
       {'id':1, 'start': new Date(year, month, day, 12), 'end': new Date(year, month, day, 13, 00),'title':'Lunch with Ashley'},
       {'id':2, 'start': new Date(year, month, day, 14), 'end': new Date(year, month, day, 14, 40),'title':'Team Picnic'},
       {'id':3, 'start': new Date(year, month, day + 1, 18), 'end': new Date(year, month, day + 1, 18, 40),'title':'Meet with Cathy'},
       {'id':4, 'start': new Date(year, month, day - 1, 8), 'end': new Date(year, month, day - 1, 9, 20),'title':'Coffee with Alyssa'},
       {'id':5, 'start': new Date(year, month, day + 1, 14), 'end': new Date(year, month, day + 1, 15),'title':'Product kickoff'}
    ]
  };

  $(document).ready(function() {
    var $calendar = $('#calendar').weekCalendar({
      timeslotsPerHour: 4,
      scrollToHourMillis : 0,
      height: function($calendar){
        return $(window).height() - $('h1').outerHeight(true);
      },
      eventRender : function(calEvent, $event) {
        if(calEvent.end.getTime() < new Date().getTime()) {
          $event.css('backgroundColor', '#aaa');
          $event.find('.time').css({'backgroundColor': '#999', 'border':'1px solid #888'});
        }
      },
      eventNew : function(calEvent, $event) {
        alert('You\'ve added a new event. You would capture this event, add the logic for creating a new event with your own fields, data and whatever backend persistence you require.');
      },
      data: function(start, end, callback) {
        var dataSource = $('#data_source').val();

        if (dataSource === '1') {
          callback(eventData1);
        } else if(dataSource === '2') {
          callback(eventData2);
        } else if(dataSource === '3') {
          callback(eventData3);
        } else {
          callback([]);
        }
      }
    });

    $('#data_source').change(function() {
      $calendar.weekCalendar('refresh');
      updateMessage();
    });

    function updateMessage() {
      var dataSource = $('#data_source').val();
      $('#message').fadeOut(function(){
        if(dataSource === '1') {
          $('#message').text('Displaying event data set 1 with timeslots per hour of 4 and timeslot height of 20px');
        } else if(dataSource === '2') {
          $('#message').text('Displaying event data set 2 with timeslots per hour of 3 and timeslot height of 30px');
        } else if(dataSource === '3') {
          $('#message').text('Displaying event data set 3 with allowEventDelete enabled. Events before today will not be deletable. A confirmation dialog is opened when you delete an event.');
        } else {
          $('#message').text('Displaying no events.');
        }
        $(this).fadeIn();
      });
    }

    updateMessage();
  });