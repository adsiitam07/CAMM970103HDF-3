import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

class ExtraTest {

	@Test
    public void prueba1()
    {
        assertTrue("Verifica abab", Extra.gus("abab"));
    }
    
    @Test
    public void prueba2()
    {
        assertTrue("Verifica gustavogustavogustavo", Extra.gus("gustavogustavogustavo"));
    }
    
    @Test
    public void prueba3()
    {
        assertTrue("Verifica ababa", Extra.gus("ababa"));
    }
    
    @Test
    public void prueba4()
    {
        assertTrue("Verifica saludossaludos", Extra.gus("saludossaludos"));
    }
    
    @Test
    public void prueba5()
    {
        assertTrue("Verifica hhhhhhhhhhhhh", Extra.gus("hhhhhhhhhhhhh"));
    }
    
    @Test
    public void prueba6()
    {
        assertTrue("Verifica cricricricricric", Extra.gus("cricricricricric"));
    }
    
    @Test
    public void prueba7()
    {
        assertTrue("Verifica ferferferfer", Extra.gus("ferferferfer"));
    }
    
    @Test
    public void prueba8()
    {
        assertTrue("Verifica fefefefef", Extra.gus("fefefefef"));
    }
    
    @Test
    public void prueba9()
    {
        assertTrue("Verifica feerfeerfeer", Extra.gus("feerfeerfeer"));
    }
    
    @Test
    public void prueba10()
    {
        assertTrue("Verifica maarcomaarco", Extra.gus("maarcomaarco"));
    }
    
    @Test
    public void prueba11()
    {
        assertTrue("Verifica pompompo", Extra.gus("pompomp"));
    }
    
    @Test
    public void prueba12()
    {
        assertTrue("Verifica jajajajajajajjajajajajajajajajajajaja", Extra.gus("jajajajajajajjajajajajajajajajajajaja"));
    }
    @Test
    public void prueba13()
    {
        assertTrue("Verifica itaaamitaaamitaaamitaaam", Extra.gus("itaaamitaaamitaaamitaaam"));
    }
    
    @Test
    public void prueba14()
    {
        assertTrue("Verifica gustavogustavogustavo", Extra.gus("gustavogustavogustavo"));
    }
    
    @Test
    public void prueba15()
    {
        assertTrue("Verifica ababa", Extra.gus("ababa"));
    }
    
    @Test
    public void prueba16()
    {
        assertTrue("Verifica ferferferferfe", Extra.gus("ferferferferfe"));
    }
    
    @Test
    public void prueba17()
    {
        assertTrue("Verifica abab", Extra.gus("abab"));
    }
    
    @Test
    public void prueba18()
    {
        assertTrue("Verifica gustavogustavogustavo", Extra.gus("gustavogustavogustavo"));
    }
    
    @Test
    public void prueba19()
    {
        assertTrue("Verifica ababa", Extra.gus("ababa"));
    }
    
    @Test
    public void prueba20()
    {
        assertTrue("Verifica ___", Extra.gus("___"));
    }
}
