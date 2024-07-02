<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS11 - Tokyo appointment using data driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>1bba06d8-8dd3-4d17-b36d-328489c6aed3</testSuiteGuid>
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
      <guid>72979ea1-41a1-4b2b-95e2-fec59e952968</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC19 - Tokyo Appointment using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ada6c75d-a770-49cf-9d34-75faad4f4c74</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Tokyo book appointment using data driven</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ada6c75d-a770-49cf-9d34-75faad4f4c74</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>fce59212-a8a8-44ac-801a-ab2f9518ece2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ada6c75d-a770-49cf-9d34-75faad4f4c74</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Visit date</value>
         <variableId>44374d9e-acd1-4e10-81a5-716c7dc48548</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ada6c75d-a770-49cf-9d34-75faad4f4c74</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comment</value>
         <variableId>bfd25a29-f126-4a92-8866-0d8fba3dfa5d</variableId>
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
