public class ShowOnlyPopFilter implements GenreFilter{
    @Override
    public boolean permit(final Album a) {
        if (a.genre().equals("Pop")){
            return true;
        }
        return false;
    }
}
