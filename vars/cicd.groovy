def gitDownload(repo)
{
 "https://github.com/IntelliqDevops/${repo}.git"
}

def buildartifact()
{
 sh 'mvn package'
}
