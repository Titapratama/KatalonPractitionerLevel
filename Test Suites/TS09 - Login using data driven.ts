<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS09 - Login using data driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>483d74e7-80c5-41f7-bb3f-5bf0147ec88c</testSuiteGuid>
   <testCaseLink>
      <guid>2399fea9-6a58-47bf-9093-cb7532e77000</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP01 - Open browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>722fd903-aa31-49dc-8d1a-3ac072be673c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>0032bb8c-b168-41e8-9fe8-5cb9dfa971f2</id>
         <masked>false</masked>
         <name>Password</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/TC17 - Login using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>001e528a-b3d3-4c0b-a545-4b678027dfd9</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login internal data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>001e528a-b3d3-4c0b-a545-4b678027dfd9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>672def20-f6d7-4212-a2e4-eb88056a497e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>001e528a-b3d3-4c0b-a545-4b678027dfd9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>0032bb8c-b168-41e8-9fe8-5cb9dfa971f2</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>a960ee10-dcd2-4a8e-aa58-abd37843e9c0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP03 - Logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
