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


>Consumption of API using a HTML interface(Run on seperate instances): [HERE](https://github.com/minusZeroo/tempconverter/blob/master/temp.html)
