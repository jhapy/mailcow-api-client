# AddDomainBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | is domain active or not |  [optional]
**aliases** | [**BigDecimal**](BigDecimal.md) | limit count of aliases associated with this domain |  [optional]
**backupmx** | **Boolean** | relay domain or not |  [optional]
**defquota** | [**BigDecimal**](BigDecimal.md) | predefined mailbox quota in &#x60;add mailbox&#x60; form |  [optional]
**description** | **String** | Description of domain |  [optional]
**domain** | **String** | Fully qualified domain name |  [optional]
**mailboxes** | [**BigDecimal**](BigDecimal.md) | limit count of mailboxes associated with this domain |  [optional]
**maxquota** | [**BigDecimal**](BigDecimal.md) | maximum quota per mailbox |  [optional]
**quota** | [**BigDecimal**](BigDecimal.md) | maximum quota for this domain (for all mailboxes in sum) |  [optional]
**restartSogo** | [**BigDecimal**](BigDecimal.md) | restart SOGo to activate the domain in SOGo |  [optional]
**relayAllRecipients** | **Boolean** | if not, them you have to create \&quot;dummy\&quot; mailbox for each address to relay |  [optional]
**rlFrame** | [**RlFrameEnum**](#RlFrameEnum) |  |  [optional]
**rlValue** | [**BigDecimal**](BigDecimal.md) | rate limit value |  [optional]
**gal** | **Boolean** | Include in Global Address List |  [optional]

<a name="RlFrameEnum"></a>
## Enum: RlFrameEnum
Name | Value
---- | -----
S | &quot;s&quot;
M | &quot;m&quot;
H | &quot;h&quot;
D | &quot;d&quot;
