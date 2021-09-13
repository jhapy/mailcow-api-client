# Apiv1editsyncjobAttr

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Is sync job active |  [optional]
**automap** | **Boolean** | Try to automap folders (\&quot;Sent items\&quot;, \&quot;Sent\&quot; &#x3D;&gt; \&quot;Sent\&quot; etc.) |  [optional]
**customParams** | **String** | Custom parameters passed to imapsync command |  [optional]
**delete1** | **Boolean** | Delete from source when completed |  [optional]
**delete2** | **Boolean** | Delete messages on destination that are not on source |  [optional]
**delete2duplicates** | **Boolean** | Delete duplicates on destination |  [optional]
**enc1** | [**Enc1Enum**](#Enc1Enum) | Encryption |  [optional]
**exclude** | **String** | Exclude objects (regex) |  [optional]
**host1** | **String** | Hostname |  [optional]
**maxage** | [**BigDecimal**](BigDecimal.md) | Maximum age of messages in days that will be polled from remote (0 &#x3D; ignore age) |  [optional]
**maxbytespersecond** | [**BigDecimal**](BigDecimal.md) | Max. bytes per second (0 &#x3D; unlimited) |  [optional]
**minsInterval** | [**BigDecimal**](BigDecimal.md) | Interval (min) |  [optional]
**password1** | **String** | Password |  [optional]
**port1** | **String** | Port |  [optional]
**skipcrossduplicates** | **Boolean** | Skip duplicate messages across folders (first come, first serve) |  [optional]
**subfolder2** | **String** | Sync into subfolder on destination (empty &#x3D; do not use subfolder) |  [optional]
**subscribeall** | **Boolean** | Subscribe all folders |  [optional]
**timeout1** | [**BigDecimal**](BigDecimal.md) | Timeout for connection to remote host |  [optional]
**timeout2** | [**BigDecimal**](BigDecimal.md) | Timeout for connection to local host |  [optional]
**user1** | **String** | Username |  [optional]

<a name="Enc1Enum"></a>
## Enum: Enc1Enum
Name | Value
---- | -----
TLS | &quot;TLS&quot;
SSL | &quot;SSL&quot;
PLAIN | &quot;PLAIN&quot;
