$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ArsSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Ars Number",
  "description": "",
  "id": "ars-number",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1513119322,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"http://35.154.153.79/bridge_aws_multi/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"shariq.abbas@authbridge.com\" and Password as \"Test@#123!\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "duration": 100899833,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://35.154.153.79/bridge_aws_multi/",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 4982155635,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shariq.abbas@authbridge.com",
      "offset": 22
    },
    {
      "val": "Test@#123!",
      "offset": 68
    }
  ],
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 314609952,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 5070948013,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Search ARS number and verify details",
  "description": "",
  "id": "ars-number;search-ars-number-and-verify-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Enter ars number in search text field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on ars number to view the details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_ars_number_in_search_text_field()"
});
formatter.result({
  "duration": 12143395857,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "duration": 21153183346,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_ars_number_to_view_the_details()"
});
formatter.result({
  "duration": 2382531559,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 78082214,
  "status": "passed"
});
formatter.before({
  "duration": 815588196,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"http://35.154.153.79/bridge_aws_multi/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"shariq.abbas@authbridge.com\" and Password as \"Test@#123!\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "duration": 517778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://35.154.153.79/bridge_aws_multi/",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 9199733659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shariq.abbas@authbridge.com",
      "offset": 22
    },
    {
      "val": "Test@#123!",
      "offset": 68
    }
  ],
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 280262552,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 5132466529,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Docs Quality Role",
  "description": "",
  "id": "ars-number;verify-docs-quality-role",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Select Docs Quality role",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Dashboard Module",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter Ars number in search text field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click On Search button of the ars",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "verify serach result No Cases found",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_Docs_Quality_role()"
});
formatter.result({
  "duration": 7371186926,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Dashboard_Module()"
});
formatter.result({
  "duration": 6031415666,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_Ars_number_in_search_text_field()"
});
formatter.result({
  "duration": 235092157,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_On_Search_button_of_the_ars()"
});
formatter.result({
  "duration": 4884568082,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_serach_result_No_Cases_found()"
});
formatter.result({
  "duration": 60292061,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 76486202,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 742039696,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens URL \"http://35.154.153.79/bridge_aws_multi/\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Email as \"shariq.abbas@authbridge.com\" and Password as \"Test@#123!\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Page Title should be \"AuthBridge Research Services: Users\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "duration": 1346746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://35.154.153.79/bridge_aws_multi/",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 10421792310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shariq.abbas@authbridge.com",
      "offset": 22
    },
    {
      "val": "Test@#123!",
      "offset": 68
    }
  ],
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 452968030,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 5117335720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AuthBridge Research Services: Users",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 3040197717,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "duration": 19716673774,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 73419410,
  "status": "passed"
});
});