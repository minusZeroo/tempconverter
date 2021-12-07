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


>Consumed using a HTML interface: [HERE](https://github.com/minusZeroo/tempconverter/blob/master/temp.html)

NB: run on seperate instances
