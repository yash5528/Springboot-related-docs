@echo off
echo Creating Service Registry...
cf create-service p-service-registry standard service-registry > nul 
:check
  cf service service-registry | find "succeeded" > nul
  if errorlevel 1 goto :check
  echo Service Registry created. Pushing applications.
  pushd blue-app
  cf push 
  popd
  pushd green-app
  cf push 
  popd
  cf map-route green-app cfapps.io -n myapptest777
  cf unmap-route blue-app cfapps.io -n myapptest777
  cf delete-route cfapps.io -n myapptest777v2

  echo Done!
