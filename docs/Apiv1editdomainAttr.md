# Apiv1editdomainAttr

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | is domain active or not |  [optional]
**aliases** | [**BigDecimal**](BigDecimal.md) | limit count of aliases associated with this domain |  [optional]
**backupmx** | **Boolean** | relay domain or not |  [optional]
**defquota** | [**BigDecimal**](BigDecimal.md) | predefined mailbox quota in &#x60;add mailbox&#x60; form |  [optional]
**description** | **String** | Description of domain |  [optional]
**gal** | **Boolean** | is domain global address list active or not, it enables shared contacts accross domain in SOGo webmail |  [optional]
**mailboxes** | [**BigDecimal**](BigDecimal.md) | limit count of mailboxes associated with this domain |  [optional]
**maxquota** | [**BigDecimal**](BigDecimal.md) | maximum quota per mailbox |  [optional]
**quota** | [**BigDecimal**](BigDecimal.md) | maximum quota for this domain (for all mailboxes in sum) |  [optional]
**relayAllRecipients** | **Boolean** | if not, them you have to create \&quot;dummy\&quot; mailbox for each address to relay |  [optional]
**relayhost** | [**BigDecimal**](BigDecimal.md) | id of relayhost |  [optional]
