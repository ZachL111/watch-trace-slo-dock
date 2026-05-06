# Review Journal

The repository goal stays the same: package a Scala local lab for slo analysis with layout fixtures, stable geometry snapshots, and documented operating limits. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 110, lane `watch`
- `stress`: `latency skew`, score 157, lane `ship`
- `edge`: `signal loss`, score 137, lane `watch`
- `recovery`: `incident shape`, score 172, lane `ship`
- `stale`: `span volume`, score 170, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
