$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Employee/Employee shall be able submit and view information online.feature");
formatter.feature({
  "line": 1,
  "name": "Employee shall be able submit and view information online",
  "description": "Description: The purpose of this feature is to submit a form for identification",
  "id": "employee-shall-be-able-submit-and-view-information-online",
  "keyword": "Feature"
});
formatter.before({
  "duration": 183835264,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User  is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UIStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 6639262468,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Employee should be able to submit a form",
  "description": "",
  "id": "employee-shall-be-able-submit-and-view-information-online;employee-should-be-able-to-submit-a-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "click on FormsPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "FormsPage gets opened",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks I9FormLink",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can fill the form with name \"sample_nm\",alias_Name \"aliasNm\",date_of_birth \"20071989\" ,current_addr \"1234\"and status \"Visa\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should be able to enter alienno \"a1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "UIStepDef.click_on_FormsPage()"
});
formatter.result({
  "duration": 1448934047,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.formspage_gets_opened()"
});
formatter.result({
  "duration": 27777945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 13
    }
  ],
  "location": "UIStepDef.user_clicks_I_FormLink(int)"
});
formatter.result({
  "duration": 1430012403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sample_nm",
      "offset": 34
    },
    {
      "val": "aliasNm",
      "offset": 57
    },
    {
      "val": "20071989",
      "offset": 81
    },
    {
      "val": "1234",
      "offset": 106
    },
    {
      "val": "Visa",
      "offset": 123
    }
  ],
  "location": "UIStepDef.user_can_fill_the_form_with_name_alias_Name_date_of_birth_current_addr_and_status(String,String,String,String,String)"
});
formatter.result({
  "duration": 1900124384,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a1234",
      "offset": 38
    }
  ],
  "location": "UIStepDef.user_should_be_able_to_enter_alienno(String)"
});
formatter.result({
  "duration": 72481,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.click_on_submit_button()"
});
formatter.result({
  "duration": 2348888740,
  "status": "passed"
});
formatter.after({
  "duration": 75196446,
  "status": "passed"
});
formatter.before({
  "duration": 59869853,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User  is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UIStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 4117171143,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#\tThen close the browser"
    },
    {
      "line": 13,
      "value": "#"
    }
  ],
  "line": 14,
  "name": "Employee should be able to edit the form",
  "description": "",
  "id": "employee-shall-be-able-submit-and-view-information-online;employee-should-be-able-to-edit-the-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "click on FormsPage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "FormsPage gets opened",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User clicks FindI9FormPageLink",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User enters formid \"1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "form details get displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "UIStepDef.click_on_FormsPage()"
});
formatter.result({
  "duration": 1394945102,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.formspage_gets_opened()"
});
formatter.result({
  "duration": 26039885,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 17
    }
  ],
  "location": "UIStepDef.user_clicks_FindI_FormPageLink(int)"
});
formatter.result({
  "duration": 1437034874,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 20
    }
  ],
  "location": "UIStepDef.user_enters_formid(String)"
});
formatter.result({
  "duration": 800666451,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.clicks_on_submit_button()"
});
formatter.result({
  "duration": 60140,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.form_details_get_displayed()"
});
formatter.result({
  "duration": 10155316,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.close_the_browser()"
});
formatter.result({
  "duration": 72198363,
  "status": "passed"
});
formatter.after({
  "duration": 27815,
  "status": "passed"
});
});