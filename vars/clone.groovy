def call(String GitURL, String GitBranch)
  echo "Cloning the code"
  git url: "${GitURL}" , branch: "${GitBranch}"
  echo "Cloning successful"
