def myGit(repo)
{
  git "${repo}"
}
def topMaven()
{
  sh 'mvn package'
}

