<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS11 - Hongkong appointment using data driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>46619936-59b8-42ca-8859-1a2e190d582c</testSuiteGuid>
   <testCaseLink>
      <guid>064a7e4d-ffad-493a-8362-a210b69eaa25</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP01 - Open browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>cf6b185b-c723-499b-99ac-0b22a8eaad6c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP02 - Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>19a95574-7e0c-4541-bd80-5436744080e9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC19 - Hongkong Appointment using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c2eaa29e-4777-4411-bd61-e216e45f3af7</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Hongkong Appointment</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>c2eaa29e-4777-4411-bd61-e216e45f3af7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>1501843b-34a1-4553-8f81-1460a332793c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c2eaa29e-4777-4411-bd61-e216e45f3af7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Visit date</value>
         <variableId>3e402376-870f-4d50-897a-865221d1fdf1</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c2eaa29e-4777-4411-bd61-e216e45f3af7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comment</value>
         <variableId>f3790999-452a-4097-a2ef-a02439313aa2</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>04be6464-75af-4493-8678-f53e6ba5c396</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP03 - Logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
