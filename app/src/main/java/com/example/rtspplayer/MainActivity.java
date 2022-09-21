package com.example.rtspplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExoPlayer player = new ExoPlayer.Builder(this).build();
        StyledPlayerView playerView = this.findViewById(R.id.video_view);
        playerView.setPlayer(player);

        // Build the media item.
        MediaItem mediaItem = MediaItem.fromUri("rtsp://172.16.10.102/stream.smp?id=1");
        // Set the media item to be played.
        player.setMediaItem(mediaItem);
        // Prepare the player.
        player.prepare();
        // Start the playback.
        player.play();
    }
}