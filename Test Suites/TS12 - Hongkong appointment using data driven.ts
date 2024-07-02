<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS12 - Hongkong appointment using data driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>74e4c3ab-1207-4a4e-ab97-f9ea31dd61a4</testSuiteGuid>
   <testCaseLink>
      <guid>7199c313-47f2-4e15-ae5f-4468d9c826b0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP01 - Open browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a7ab92e1-0c81-4933-9697-95959cfa33b4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP02 - Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>d2537c0b-bc4f-41f9-95ca-1b0a7583a428</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC20 - Hongkong Appointment using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>233e4a2c-0e1e-496a-b03d-e7f6da3ef204</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Hongkong book appointment using data driven</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>233e4a2c-0e1e-496a-b03d-e7f6da3ef204</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>b72f9cc2-3e49-4a31-93ce-59c07f49bd58</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>233e4a2c-0e1e-496a-b03d-e7f6da3ef204</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Visit date</value>
         <variableId>e58c62fd-48f2-40b0-af61-35d284a665f3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>233e4a2c-0e1e-496a-b03d-e7f6da3ef204</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comment</value>
         <variableId>65936dbe-1f3f-467a-9c8c-5e2a8e5b7bc4</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>22e03b9d-b21f-4625-a1d4-be82e65c5aae</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP03 - Logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
