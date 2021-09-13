# AddTlspolicymapBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | **String** | custom parameters you find out more about them [here](http://www.postfix.org/postconf.5.html#smtp_tls_policy_maps) |  [optional]
**active** | [**BigDecimal**](BigDecimal.md) | 1 for a active user account 0 for a disabled user account |  [optional]
**dest** | **String** | the target domain or email address |  [optional]
**policy** | [**PolicyEnum**](#PolicyEnum) | the policy |  [optional]

<a name="PolicyEnum"></a>
## Enum: PolicyEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
MAY | &quot;may&quot;
ENCRYPT | &quot;encrypt&quot;
DANE | &quot;dane&quot;
_DANE | &quot;&#x27;dane&quot;
FINGERPRINT | &quot;fingerprint&quot;
VERIFY | &quot;verify&quot;
SECURE | &quot;secure&quot;
