<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS10 - Seoul appointment using data driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>0bbecabd-13ab-4c6a-ab05-9c8e4db5f385</testSuiteGuid>
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
      <guid>5c7c2306-cf28-4940-88e6-7e67763ebbcd</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC18 - Seoul Appointment using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0a41ca67-d208-47a2-9957-e52bf9c795ce</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Seoul book appointment using data driven</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0a41ca67-d208-47a2-9957-e52bf9c795ce</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>347cdaa6-fa89-4ca5-a3fa-63bf199968eb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0a41ca67-d208-47a2-9957-e52bf9c795ce</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Visit date</value>
         <variableId>1dfcca67-9b5b-4643-81dc-ae88a2b0f365</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0a41ca67-d208-47a2-9957-e52bf9c795ce</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comment</value>
         <variableId>227d2245-380d-4f6d-9274-9550ae75f2aa</variableId>
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
