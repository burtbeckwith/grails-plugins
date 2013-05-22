//
// This script is executed by Grails during application upgrade ('grails upgrade'
// command). This script is a Gant script so you can use all special variables
// provided by Gant (such as 'baseDir' which points on project base dir). You can
// use 'ant' to access a global instance of AntBuilder
//
// For example you can create directory under project tree:
//
//    ant.mkdir(dir:"${basedir}/grails-app/jobs")
//
println '''
*********************************************************************
* You've installed the Spring Security Tencent plugin.             *
*                                                                   *
* Next run the "grails s2-init-tencent" script to configure plugin.*
*                                                                   *
*********************************************************************
'''