# Implicit-Intent-Example-Android-Kotlin

**Intent:** 
1. an object representing a desired action;
2. used as a bridge between activities, for one to invoke another
3. the activity can be in the same app or in a different app
4. can store extra data to pass as "parameters" to that activity
5. second activity can "return" information back to the caller if needed

**Intent Usage**
1. to start an activity from another activity in the same app.
e.g., Activity1 launches Activity2.
2. Here our application opens the dial of phone.

**Intent Types**
1. explicit: Names a particular activity to launch.
2. implicit: Describes task to perform; one of many apps could potentially handle it.
3. implicit intent: One that launches another app, without naming that specific app, to handle a given type of request or action.
4. **examples:** invoke default browser; load music player to play a song
