# Apiv1editfail2banAttr

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backlist** | **String** | the backlisted ips or hostnames separated by comma |  [optional]
**banTime** | [**BigDecimal**](BigDecimal.md) | the time a ip should be banned |  [optional]
**maxAttempts** | [**BigDecimal**](BigDecimal.md) | the maximum numbe of wrong logins before a ip is banned |  [optional]
**netbanIpv4** | [**BigDecimal**](BigDecimal.md) | the networks mask to ban for ipv4 |  [optional]
**netbanIpv6** | [**BigDecimal**](BigDecimal.md) | the networks mask to ban for ipv6 |  [optional]
**retryWindow** | [**BigDecimal**](BigDecimal.md) | the maximum time in which a ip as to login with false credentials to be banned |  [optional]
**whitelist** | **String** | whitelisted ips or hostnames sepereated by comma |  [optional]
