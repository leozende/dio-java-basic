package set;

public class Serie implements Comparable<Serie>{
    private String name;
    private String genre;
    private Integer EpisodeTime;

    public Serie(String name, String genre, Integer episodeTime) {
        this.name = name;
        this.genre = genre;
        EpisodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodeTime() {
        return EpisodeTime;
    }

    @Override
    public String toString() {
        return "Serie [ name= " + name + ", genre= " + genre + ", EpisodeTime= " + EpisodeTime + " ]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((EpisodeTime == null) ? 0 : EpisodeTime.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (EpisodeTime == null) {
            if (other.EpisodeTime != null)
                return false;
        } else if (!EpisodeTime.equals(other.EpisodeTime))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int episodeTime = Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());
        if(episodeTime != 0) return episodeTime;
        return this.getGenre().compareTo(serie.getGenre());
    }

    
}
