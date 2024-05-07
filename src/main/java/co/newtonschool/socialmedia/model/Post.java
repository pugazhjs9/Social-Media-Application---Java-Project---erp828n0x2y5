package co.newtonschool.socialmedia.model;

import java.time.LocalDateTime;

public class Post {
    private int postId;
    private String content;
    private LocalDateTime createdAt;
    private int likeCount;
    private int unlikeCount;

    public Post(String content) {
        this.content = content;
        this.createdAt = LocalDateTime.now();
        this.likeCount = 0;
        this.unlikeCount = 0;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getUnlikeCount() {
        return unlikeCount;
    }

    public void setUnlikeCount(int unlikeCount) {
        this.unlikeCount = unlikeCount;
    }
}

// class PostResponse {
//     private int postId;
//     private String content;
//     private LocalDateTime createdAt;
//     private int likeCount;
//     private int unlikeCount;

//     public PostResponse(int postId, String content, LocalDateTime createdAt, int likeCount, int unlikeCount) {
//         this.postId = postId;
//         this.content = content;
//         this.createdAt = createdAt;
//         this.likeCount = likeCount;
//         this.unlikeCount = unlikeCount;
//     }
//     public Long getPostId() {
//         return postId;
//     }

//     public void setPostId(Long postId) {
//         this.postId = postId;
//     }

//     public String getContent() {
//         return content;
//     }

//     public void setContent(String content) {
//         this.content = content;
//     }

//     public LocalDateTime getCreatedAt() {
//         return createdAt;
//     }

//     public void setCreatedAt(LocalDateTime createdAt) {
//         this.createdAt = createdAt;
//     }

//     public int getLikeCount() {
//         return likeCount;
//     }

//     public void setLikeCount(int likeCount) {
//         this.likeCount = likeCount;
//     }

//     public int getUnlikeCount() {
//         return unlikeCount;
//     }

//     public void setUnlikeCount(int unlikeCount) {
//         this.unlikeCount = unlikeCount;
//     }
// }

