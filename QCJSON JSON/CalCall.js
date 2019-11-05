$(document).ready(function() {
  // Fetch our events
  $.ajax({
    url: "*future family json file",
    method: "GET",
    datatype: "json",
    data: {
      "$where" : "start_date_time > '" + moment().subtract(31, 'days').format("YYYY-MM-DDT00:00:00") + "'",
      "month" : "January",
      "$order" : "start_date_time DESC"
    }
  }).done(function(response) {
    // TODO: Handle our response
  });
});