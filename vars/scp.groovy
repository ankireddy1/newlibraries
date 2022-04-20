def myGit(repo)
{
  git "${repo}"
}
def topMaven()
{
  sh 'mvn package'
}
def appDeploy(jobname,ip,appname)
{
  sh  "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}"
}


