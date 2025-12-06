def gitDownload(repo)
{
 "https://github.com/IntelliqDevops/${repo}.git"
}

def buildArtifact()
{
 sh 'mvn package'
}
