...
  }).done(function(response) {
    // Parse calendar items by month for FullCalendar
    var events = [];
    $.each(response, function(idx, e) {
      events.push({
        start: e.start_date_time,
        end: e.end_date_time,
        title: e.meeting_title,
        url: e.web_link
      });
    });

    // TODO: Initialize calendar
  });
});