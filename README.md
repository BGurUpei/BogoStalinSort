# BogoStalinSort
2nd Best sorting method after Bogosort

After spending months and countless hours to create the new best sorting method, I realized I can't bogo sort is just too good.  <br>
So I started working on the 2nd best sorting method, after watching a top 10 worst sorting mehtods video (link down below)  <br>
I decided on 2 things:
1) **the shuffle from bogo sort needs to stay**
2) **Stalin sort sounds funny and I need to include it**

so I created BogoStalin sort.  <br>
Essentially works like bogo sort, but before it shuffles it eliminates the first index of the item that breaks the ascending order  <br>
Can only sort in ascending order  <br>

technical details:  <br>
complexity : yes  <br>
best case : O(n)  <br>


Last but not least, example run of the sorting method (printing between steps with commentary)
```
Original List: [24, 30, 42, 78, 75, 76, 32, 35, 19, 65]
BogoStalin sort Begin
[24, 30, 42, 78, 76, 32, 35, 19, 65]-- Stalined the number 75
[35, 32, 30, 24, 65, 78, 42, 19, 76]-- BoGo-ed (shuffle)
[35, 30, 24, 65, 78, 42, 19, 76]-- Stalined the number 32
[24, 42, 19, 65, 35, 76, 78, 30]-- BoGo-ed (shuffle)
[24, 42, 65, 35, 76, 78, 30]-- Stalined the number 19
[24, 78, 30, 42, 65, 35, 76]-- BoGo-ed (shuffle)
[24, 78, 42, 65, 35, 76]-- Stalined the number 30
[42, 24, 65, 76, 35, 78]-- BoGo-ed (shuffle)
[42, 65, 76, 35, 78]-- Stalined the number 24
[76, 42, 65, 78, 35]-- BoGo-ed (shuffle)
[76, 65, 78, 35]-- Stalined the number 42
[65, 76, 78, 35]-- BoGo-ed (shuffle)        
[65, 76, 78]-- Stalined the number 35
end of BogoStalin sort
Sorted List: [65, 76, 78]
```

**Feel free to fork or report any issues**
Inspired after watching this video: https://youtu.be/ktgxMtWMflU?si=rOufqgjW2t0o80ZZ
