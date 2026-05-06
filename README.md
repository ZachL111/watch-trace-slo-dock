# watch-trace-slo-dock

`watch-trace-slo-dock` keeps a focused Scala implementation around observability. The project goal is to package a Scala local lab for slo analysis with layout fixtures, stable geometry snapshots, and documented operating limits.

## Why It Exists

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Watch Trace Slo Dock Review Notes

`recovery` and `baseline` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Features

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/watch-trace-slo-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `incident shape` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The added Scala path is deliberately direct, with fixtures doing most of the explaining.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `recovery` is the high score at 172; `baseline` is the low score at 110.

## Limitations And Roadmap

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
