# AndFixDemo
首次提交
cmd命令  .\apkpatch.bat -f app2.apk -t app1.apk -o output -k mykey.jks -p 102031 -a lcr -e 102031
apkpatch.bat -f 新apk -t 旧apk -o 输出目录 -k app签名文件 -p 签名文件密码 -a 签名文件别名 -e 别名密码

-f <new.apk> ：新apk
-t <old.apk> : 旧apk
-o <output> ： 输出目录（补丁文件的存放目录）
-k <keystore>： 打包所用的keystore
-p <password>： keystore的密码
-a <alias>： keystore 用户别名
-e <alias password>： keystore 用户别名密码
生成的output文件

作者：anhao_chan
链接：http://www.jianshu.com/p/907a2c599996
來源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
