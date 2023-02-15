#!/bin/bash
if [ $1 == 'all' ]
then
  mvn  clean install org.pitest:pitest-maven:mutationCoverage -DwithHistory -DtimestampedReports=false -e
else
  currentBranch=$(git rev-parse --abbrev-ref HEAD)
  echo "Will compare the branch ${currentBranch} with origin/develop"
  mvn clean install org.pitest:pitest-maven:scmMutationCoverage
  -DoriginBranch=${currentBranch}
  -DdestinationBranch=origin/develop
  -DtimestampedReports=false
  echo "Opening the pit-report, path: target/pit-reports/index.html"
fi
read -s -n 1
man open -a "Google Chrome" target/pit-reports/index.html