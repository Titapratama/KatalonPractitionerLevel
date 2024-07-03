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
   <testSuiteGuid>ee942383-b289-40f1-815f-518352daf936</testSuiteGuid>
   <testCaseLink>
      <guid>3938e9be-4b34-4a95-a86b-5f8915396dc3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP01 - Open browser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>e86c805f-91e5-4edc-938c-9f75cff288d0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP02 - Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>5363faea-e63c-4188-b946-faf09c3ae160</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC18 - Seoul Appointment using data driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>dd862714-afef-42f7-a72b-331e9275a135</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Seoul Appoitment</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>dd862714-afef-42f7-a72b-331e9275a135</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>347cdaa6-fa89-4ca5-a3fa-63bf199968eb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dd862714-afef-42f7-a72b-331e9275a135</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Facility</value>
         <variableId>1dfcca67-9b5b-4643-81dc-ae88a2b0f365</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dd862714-afef-42f7-a72b-331e9275a135</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Comment</value>
         <variableId>227d2245-380d-4f6d-9274-9550ae75f2aa</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>07a1184c-227d-4193-9772-4e753d4aaa17</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Test Case Properties/TCP03 - Logout</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
