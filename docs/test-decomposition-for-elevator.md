# Test Decomposition for Elevator

## Objective
Define basic functions of elevator, break down functions into separate tasks, those tasks should be divided into 2 transactions:
- Positive transaction means expected successful system behavior.
- Negative transaction means invalid or restricted action that should be prevented or handled safely.

| Function | Task | Transaction |
|---|---|---|
| Floor Selection | Select floor | Positive: valid floor is selected successfully |
| Floor Selection | Select floor | Negative: invalid floor cannot be selected |
| Elevator Movement | Move to selected floor | Positive: elevator reaches expected floor |
| Elevator Movement | Move to selected floor | Negative: elevator doesn't move when doors are open |
| Open Door Control | Open doors | Positive: doors open successfully |
| Open Door Control | Open doors | Negative: doors can't be opened during movement |
| Close Door Control | Close doors | Positive: doors close successfully |
| Close Door Control | Close doors | Negative: doors reopen if obstacle detected |
| Safety Features | Start elevator | Positive: elevator starts under allowed conditions |
| Safety Features | Start elevator | Negative: elevator doesn't start when overloaded |
| Emergency Button | Press emergency button | Positive: alarm is activated |
| Emergency Button | Press emergency button | Negative: system prevents accidental misuse |
| Power Handling | Handle power outage | Positive: elevator operates normally when power is stable |
| Power Handling | Handle power outage | Negative: elevator stops and opens doors at the nearest floor when power is lost |