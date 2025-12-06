def gitDownload(repo)
{
 "https://github.com/guruvinayaws/${repo}.git"
}

def buildArtifact()
{
  sh 'mvn package'
}

