# efficiencyCalculator
This is a program that calculates efficiency and power output of a wind turbine based on resistance, voltage, air density, swept area, and velocity.
The air density, swept area, and velocity are roughly constants depending on the specific model of the wind turbine.
The program initializes two arrays: Resistance and Voltage of the specific wind turbine, and the equations to calculate efficiency and power are used
efficiency = Voltage2/Resistance0.5*density*area*velocity3
Power = 0.5*density*velocity3*area*efficiency
