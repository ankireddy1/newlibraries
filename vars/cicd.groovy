def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '2f830b86-9f9e-4278-8c6d-9d0b3c0dd7af', path: '', url:"${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def newTest()
{
  sh 'java -jar testing.jar'
}
