# cpu-schedule-simulator
A simple real time process scheduling simulator, capable of simulating the Round Robin, Rate Monotonic and Earliest Deadline First scheduling policies.

This is a simple program made in Java with Swing whose objective is to simulate the scheduling of CPU time by a group of real time processes. It supports up to 6 processes, and takes as inputs the quantum (RR only), the time each process needs to do its task and the period at which the task must be done. The output is a table showing which process will be running in the CPU for each of the 50 first units of time, and the % of CPU load.

Some links about RTCS:

https://en.wikipedia.org/wiki/Real-time_computing

https://en.wikipedia.org/wiki/Scheduling_(computing)

https://en.wikipedia.org/wiki/Round-robin_scheduling

https://en.wikipedia.org/wiki/Rate-monotonic_scheduling

https://en.wikipedia.org/wiki/Earliest_deadline_first_scheduling

Here are some screenshots of the program scheduling 4 processes with the 3 policies:
The slider sets the number of processes
The first column holds the names of the processes
The second column holds the time each process needs to do its task
The third column holds the period at which each task must be repeated

### Round Robin:
![alt text](https://github.com/yurimachioni/cpu-schedule-simulator/blob/master/screenshots/roundrobin.png "round robin")

### Rate Monotonic:
![alt text](https://github.com/yurimachioni/cpu-schedule-simulator/blob/master/screenshots/ratemonotonic.png "rate monotonic")

### Earliest Deadline First:
![alt text](https://github.com/yurimachioni/cpu-schedule-simulator/blob/master/screenshots/edf.png "earliest deadline first")
