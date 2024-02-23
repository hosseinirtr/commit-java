 _________________

| User                    |
|-------------------------|
| `username`: str         |
| `password`: str         |
| `email`: str            |
| `date_joined`: datetime |
| `ID`: Auto Generate     |

 _________________

| Post                 |
|----------------------|
| `author`: User_ID    |
| `content`: text      |
| `date`: datetime     |
| `image_cover`: image |
| `likes`: [User]      |
| `dislikes`: [User]   |
| `ID`: Auto Generate  |

 _________________

| Like                |
|---------------------|
| `user`: User        |
| `post`: Post        |
| `ID`: Auto Generate |

 _________________

| Dislike             |
|---------------------|
| `user`: User        |
| `post`: Post_ID     |
| `ID`: Auto Generate |

 _________________

| Comment             |
|---------------------|
| `user`: User_ID     |
| `post`: Post_ID     |
| `date`: datetime    |
| `text`: text        |
| `ID`: Auto Generate |

 _________________

| Follow                  |
|-------------------------|
| `current_user`: User    |
| `second_user`: User     |
| `ID`: Auto Generate     |
| `each_other ? `: bool ? |

