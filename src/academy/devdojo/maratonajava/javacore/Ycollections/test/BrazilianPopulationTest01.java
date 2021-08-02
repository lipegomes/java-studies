package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.BrazilianPopulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class PopulationAgeComparator implements Comparator<BrazilianPopulation> {

    @Override
    public int compare(BrazilianPopulation population1, BrazilianPopulation population2) {
        return population1.getAge().compareTo(population2.getAge());
    }
}

// Source of data information: https://ftp.ibge.gov.br/Projecao_da_Populacao/Projecao_da_Populacao_2018/projecoes_2018_populacao_idade_simples_2010_2060_20201209.xls
public class BrazilianPopulationTest01 {
    public static void main(String[] args) {
        List<BrazilianPopulation> population = new ArrayList<>();
        population.add(new BrazilianPopulation(0L, 2021, 1495092L, 'M'));
        population.add(new BrazilianPopulation(1L, 2021, 1503576L, 'M'));
        population.add(new BrazilianPopulation(2L, 2021, 1512039L, 'M'));
        population.add(new BrazilianPopulation(3L, 2021, 1520011L, 'M'));
        population.add(new BrazilianPopulation(4L, 2021, 1492581L, 'M'));
        population.add(new BrazilianPopulation(5L, 2021, 1503791L, 'M'));
        population.add(new BrazilianPopulation(6L, 2021, 1534825L, 'M'));
        population.add(new BrazilianPopulation(7L, 2021, 1503586L, 'M'));
        population.add(new BrazilianPopulation(8L, 2021, 1483167L, 'M'));
        population.add(new BrazilianPopulation(9L, 2021, 1486883L, 'M'));
        population.add(new BrazilianPopulation(10L, 2021, 1481330L, 'M'));

        population.add(new BrazilianPopulation(0L, 2021, 1426278L, 'F'));
        population.add(new BrazilianPopulation(1L, 2021, 1434673L, 'F'));
        population.add(new BrazilianPopulation(2L, 2021, 1443013L, 'F'));
        population.add(new BrazilianPopulation(3L, 2021, 1450935L, 'F'));
        population.add(new BrazilianPopulation(4L, 2021, 1425083L, 'F'));
        population.add(new BrazilianPopulation(5L, 2021, 1436087L, 'F'));
        population.add(new BrazilianPopulation(6L, 2021, 1465983L, 'F'));
        population.add(new BrazilianPopulation(7L, 2021, 1436471L, 'F'));
        population.add(new BrazilianPopulation(8L, 2021, 1417344L, 'F'));
        population.add(new BrazilianPopulation(9L, 2021, 1421257L, 'F'));
        population.add(new BrazilianPopulation(10L, 2021, 1416393L, 'F'));

        population.sort(new PopulationAgeComparator());
        System.out.println("--- Ordenado usando comparator via age ---");
        for (BrazilianPopulation age : population) {
            System.out.println(age);
        }
    }
}
