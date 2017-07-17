# HelloAppEngineGradle

Initial Release

1. test your app locally

  gradle appengineStage
  gradle appengineRun
  gradle appengineStop

2.  deploy your app to appengine
  gradle appengineUpdate
3. visit your app
  https://project-id.appspot.com/hellogradle

note:

1. project-id is your project id which you can get in app engine dashboard. which also has to be defined in appengine-web.xml "<application>project-id</application>"
2. 
2. you can't specify appengine port
