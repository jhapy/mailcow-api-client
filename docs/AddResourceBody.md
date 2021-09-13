# AddResourceBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | [**BigDecimal**](BigDecimal.md) | 1 for a active transport map 0 for a disabled transport map |  [optional]
**description** | **String** | a description of the resource |  [optional]
**domain** | **String** | the domain for which the resource should be |  [optional]
**kind** | [**KindEnum**](#KindEnum) | the kind of recouse |  [optional]
**multipleBookings** | [**MultipleBookingsEnum**](#MultipleBookingsEnum) |  |  [optional]
**multipleBookingsCustom** | [**BigDecimal**](BigDecimal.md) | always empty |  [optional]
**multipleBookingsSelect** | [**MultipleBookingsSelectEnum**](#MultipleBookingsSelectEnum) |  |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
LOCATION | &quot;location&quot;
GROUP | &quot;group&quot;
THING | &quot;thing&quot;

<a name="MultipleBookingsEnum"></a>
## Enum: MultipleBookingsEnum
Name | Value
---- | -----
_1 | &quot;-1&quot;
_1_1 | &quot;1&quot;
CUSTOM | &quot;custom&quot;

<a name="MultipleBookingsSelectEnum"></a>
## Enum: MultipleBookingsSelectEnum
Name | Value
---- | -----
_1 | &quot;-1&quot;
_1_1 | &quot;1&quot;
CUSTOM | &quot;custom&quot;
