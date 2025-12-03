# logging-lib

Advanced structured logging library for Quarkus-based microservices.

Features:
- JSON structured logs (Logstash encoder)
- CorrelationId / TraceId generation & propagation (MDC)
- Request logging filter (path, method, status, duration)
- Exception mapper for structured error logs
- PII masking utilities
- Integration examples

## Quick start

1. Add the dependency (install to local repo or publish)
2. Register filters in your Quarkus application
3. Use StructuredLogger from your services

