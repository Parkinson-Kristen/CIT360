<!DOCTYPE html>
<html>
  <head>
    <!-- JS Dependencies -->
    <script data-require="jquery@*" data-semver="" src=""></script>
    <script data-require="moment.js@*" data-semver="" src=""></script>
    <script src="///fullcalendar.min.js"></script>
    
    <!-- CSS Styles -->
    <link rel="stylesheet" href="//fullcalendar.min.css" />
  </head>

  <body>
    <div id="calendar"></div>

    <script type="text/javascript">
$(document).ready(function() {
  // Fetch our events
  $.ajax({
      url: "",
    method: "GET",
    datatype: "json",
    data: {
      "$where" : "start_date_time > '" + moment().subtract(31, 'days').format("YYYY-MM-DDT00:00:00") + "'",
      "city" : "Portland",
      "$order" : "start_date_time DESC"
    }
  }).done(function(response) {
    // Parse calendar events for FullCalendar
    var events = [];
    $.each(response, function(idx, e) {
      events.push({
        start: e.start_date_time,
        end: e.end_date_time,
        title: e.meeting_title,
        url: e.web_link
      });
    });
    $('#calendar').fullCalendar({
      events: events
    });
  });
});
    </script>
  </body>
</html>