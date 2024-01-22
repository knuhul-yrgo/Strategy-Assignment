public class ExcludePopFilter implements GenreFilter{

    @Override
    public boolean permit(final Album a) {
        if (a.genre().equals("Pop")){
            return false;
        }
        return true;
    }
}
