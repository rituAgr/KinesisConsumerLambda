## This is sample project to demo Kinesis consumer with lambda.
Things to Note:

* It is lambda that needs the IAM permission to fetch record from Kinesis stream.
  Because Records are pulled by consumer (Lambda, or s3, etc...) with Kinesis Stream.
* There is no AWS creds mentioned in application because locally the jar is build with
  dependencies. We used maven assembly plugin for it. Once, jar with dependencies are 
  build, it is uploaded in AWS Lambda Code section. Note that jar size should be less 
  than 10 MB. Hence, Lambda code need to be small.
* There needs to be Kinesis stream named 'order-stream' to which this lambda jar will 
  consume data from. Again this lambda structure and connect to stream is made in AWS UI.

**This project is built following [Kinesis+Lambda Consumer YouTube Link](https://www.youtube.com/watch?v=G9nSwSd64RU&t=649s).**

On the producer side of kinesis stream, below are details:
* [Github Code Link](https://github.com/rituAgr/KinesisProducer/tree/master)
* [YouTube Link](https://www.youtube.com/watch?v=05yauiKMWBM&list=PLLv1Hn1N3bRwhRLFm37JGCgkcI8wWtQ-a&index=5)
