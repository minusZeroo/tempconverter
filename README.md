# Temperature Conversion API
Converts across kelvin, celsius and fahrenheit temperature values


Endpoint: /convertTemp

Method: POST


> Sample payload/request:

```JSON
{
   "toUnit": "fahrenheit",
    "fromUnit": "celsius",
    "data": 12
}
```

> Output:


53.6


>Consumption of API link: 
(Run on seperate instances)
```
>> See link to web consumption [Link](https://github.com/minusZeroo/tempconverter/blob/master/temp.html)
