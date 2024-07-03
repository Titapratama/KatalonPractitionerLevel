<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS12 - Tokyo appointment using data driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>c642c6ee-2dda-4736-b69f-6e319392cd9b</testSuiteGuid>
   <testCaseLink>
      <guid>83743d3c-14c5-44cf-941b-b9bcdad46b6d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP01 - Open browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>15faa208-20b3-4661-991f-3e1bf08cf899</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP02 - Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>12a5f8b1-491c-4560-bb10-e7cb687e6af3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC20 - Tokyo appointment using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>88f73976-1fc5-4d98-b0e7-d599f95e09bf</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Tokyo Appointment - internal data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>88f73976-1fc5-4d98-b0e7-d599f95e09bf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>c59c0522-b84d-425a-87b1-b0a18c3d09de</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>88f73976-1fc5-4d98-b0e7-d599f95e09bf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Date visit</value>
         <variableId>5de60489-7763-4ea8-9ec6-5583d92fd399</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>88f73976-1fc5-4d98-b0e7-d599f95e09bf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comment section</value>
         <variableId>08476f1a-b557-4d3b-9741-01b4031465d9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5359c2ae-3106-422e-b6be-a185d6cba2b8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP03 - Logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
