401 Unauthorized  Error
---------------------------
Access the URL localhost:8080/lab-security/fruits

Get tokens using HTTP POST 
--------------------------------
endpoint url /oauth/token with grant_type=password 
and resource owner like the URL localhost:8080/lab-security/oauth/token?grant_type=password&username=admin&password=admin123

set Header Authorization with client credential myRestClient/P@ssw0rd

Use the access token to request resources
-----------------------------------------------
localhost:8080/lab-security/fruits?access_token=cc5f0824-7592-4670-8c64-c5914833ca0a

Refresh token
-------------
localhost:8080/lab-security/oauth/token?grant_type=refresh_token&refresh_token=2645c8a4-548c-45d4-a0d2-96f7719c062c