package org.example;
import org.example.beckDepression.BeckDepression;
import org.example.beckDepression.Question;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>();
        lhm1.put("Я не чувствую себя расстроенным, печальным.", 0);
        lhm1.put("Я расстроен.", 1);
        lhm1.put("Я все время расстроен и не могу от этого отключиться.", 2);
        lhm1.put("Я настолько расстроен и несчастлив, что не могу это выдержать", 3);
        Question q1 = new Question(lhm1);

        LinkedHashMap<String, Integer> lhm2 = new LinkedHashMap<>();
        lhm2.put("Я не тревожусь о своем будущем.", 0);
        lhm2.put("Я чувствую, что озадачен будущим.", 1);
        lhm2.put("Я чувствую, что меня ничего хорошего не ждет в будущем", 2);
        lhm2.put("Мое будущее безнадежно, и ничто не может измениться к лучшему.", 3);
        Question q2 = new Question(lhm2);

        LinkedHashMap<String, Integer> lhm3 = new LinkedHashMap<>();
        lhm3.put("Я не чувствую себя неудачником.", 0);
        lhm3.put("Я чувствую, что терпел больше неудач, чем другие люди.", 1);
        lhm3.put("Когда я оглядываюсь на свою жизнь, я вижу в ней много неудач.", 2);
        lhm3.put("Я чувствую, что как личность я - полный неудачник.", 3);
        Question q3 = new Question(lhm3);

        LinkedHashMap<String, Integer> lhm4 = new LinkedHashMap<>();
        lhm4.put("Я получаю столько же удовлетворения от жизни, как раньше.", 0);
        lhm4.put("Я не получаю столько же удовлетворения от жизни, как раньше.", 1);
        lhm4.put("Я больше не получаю удовлетворения ни от чего.", 2);
        lhm4.put("Я полностью не удовлетворен жизнью и мне все надоело.", 3);
        Question q4 = new Question(lhm4);

        LinkedHashMap<String, Integer> lhm5 = new LinkedHashMap<>();
        lhm5.put("Я не чувствую себя в чем-нибудь виноватым.", 0);
        lhm5.put("Достаточно часто я чувствую себя виноватым.", 1);
        lhm5.put("Большую часть времени я чувствую себя виноватым.", 2);
        lhm5.put("Я постоянно испытываю чувство вины.", 3);
        Question q5 = new Question(lhm5);

        LinkedHashMap<String, Integer> lhm6 = new LinkedHashMap<>();
        lhm6.put("Я не чувствую, что могу быть наказанным за что-либо.", 0);
        lhm6.put("Я чувствую, что могу быть наказан.", 1);
        lhm6.put("Я ожидаю, что могу быть наказан.", 2);
        lhm6.put("Я чувствую себя уже наказанным.", 3);
        Question q6 = new Question(lhm6);

        LinkedHashMap<String, Integer> lhm7 = new LinkedHashMap<>();
        lhm7.put("Я не разочаровался в себе.", 0);
        lhm7.put("Я разочаровался в себе.", 1);
        lhm7.put("Я себе противен.", 2);
        lhm7.put("Я себя ненавижу.", 3);
        Question q7 = new Question(lhm7);

        LinkedHashMap<String, Integer> lhm8 = new LinkedHashMap<>();
        lhm8.put("Я знаю, что я не хуже других.", 0);
        lhm8.put("Я критикую себя за ошибки и слабости.", 1);
        lhm8.put("Я все время обвиняю себя за свои поступки.", 2);
        lhm8.put("Я виню себя во всем плохом, что происходит.", 3);
        Question q8 = new Question(lhm8);

        LinkedHashMap<String, Integer> lhm9 = new LinkedHashMap<>();
        lhm9.put("Я никогда не думал покончить с собой.", 0);
        lhm9.put("Ко мне приходят мысли покончить с собой, но я не буду их осуществлять.", 1);
        lhm9.put("Я хотел бы покончить с собой.", 2);
        lhm9.put("Я бы убил себя, если бы представился случай.", 3);
        Question q9 = new Question(lhm9);

        LinkedHashMap<String, Integer> lhm10 = new LinkedHashMap<>();
        lhm10.put("Я плачу не больше, чем обычно.", 0);
        lhm10.put("Сейчас я плачу чаще, чем раньше.", 1);
        lhm10.put("Теперь я все время плачу.", 2);
        lhm10.put("Я раньше мог плакать, а сейчас не могу, даже если мне хочется.", 3);
        Question q10 = new Question(lhm10);

        LinkedHashMap<String, Integer> lhm11 = new LinkedHashMap<>();
        lhm11.put("Сейчас я раздражителен не более, чем обычно.", 0);
        lhm11.put("Я более легко раздражаюсь, чем раньше.", 1);
        lhm11.put("Теперь я постоянно чувствую, что раздражен.", 2);
        lhm11.put("Я стал равнодушен к вещам, которые меня раньше раздражали.", 3);
        Question q11 = new Question(lhm11);

        LinkedHashMap<String, Integer> lhm12 = new LinkedHashMap<>();
        lhm12.put("Я не утратил интереса к другим людям.", 0);
        lhm12.put("Я меньше интересуюсь другими людьми, чем раньше.", 1);
        lhm12.put("Я почти потерял интерес к другим людям.", 2);
        lhm12.put("Я полностью утратил интерес к другим людям.", 3);
        Question q12 = new Question(lhm12);

        LinkedHashMap<String, Integer> lhm13 = new LinkedHashMap<>();
        lhm13.put("Я откладываю принятие решения иногда, как и раньше.", 0);
        lhm13.put("Я чаще, чем раньше, откладываю принятие решения.", 1);
        lhm13.put("Мне труднее принимать решения, чем раньше.", 2);
        lhm13.put("Я больше не могу принимать решения.", 3);
        Question q13 = new Question(lhm13);

        LinkedHashMap<String, Integer> lhm14 = new LinkedHashMap<>();
        lhm14.put("Я не чувствую, что выгляжу хуже, чем обычно.", 0);
        lhm14.put("Меня тревожит, что я выгляжу старым и непривлекательным.", 1);
        lhm14.put("Я знаю, что в моей внешности произошли изменения, делающие меня непривлекательным.", 2);
        lhm14.put("Я знаю, что выгляжу безобразно.", 3);
        Question q14 = new Question(lhm14);

        LinkedHashMap<String, Integer> lhm15 = new LinkedHashMap<>();
        lhm15.put("Я могу работать так же хорошо, как и раньше.", 0);
        lhm15.put("Мне необходимо сделать дополнительное усилие, чтобы начать делать что-нибудь.", 1);
        lhm15.put("Я с трудом заставляю себя делать что-либо.", 2);
        lhm15.put("Я совсем не могу выполнять никакую работу.", 3);
        Question q15 = new Question(lhm15);

        LinkedHashMap<String, Integer> lhm16 = new LinkedHashMap<>();
        lhm16.put("Я сплю так же хорошо, как и раньше.", 0);
        lhm16.put("Сейчас я сплю хуже, чем раньше.", 1);
        lhm16.put("Я просыпаюсь на 1–2 часа раньше и не могу заснуть опять.", 2);
        lhm16.put("Я просыпаюсь на несколько часов раньше и больше не могу заснуть.", 3);
        Question q16 = new Question(lhm16);

        LinkedHashMap<String, Integer> lhm17 = new LinkedHashMap<>();
        lhm17.put("Я устаю не больше, чем обычно.", 0);
        lhm17.put("Теперь я устаю быстрее, чем раньше.", 1);
        lhm17.put("Я устаю почти от всего, что делаю.", 2);
        lhm17.put("Я не могу ничего делать из-за усталости.", 3);
        Question q17 = new Question(lhm17);

        LinkedHashMap<String, Integer> lhm18 = new LinkedHashMap<>();
        lhm18.put("Мой аппетит не хуже, чем обычно.", 0);
        lhm18.put("Мой аппетит стал хуже, чем раньше.", 1);
        lhm18.put("Мой аппетит теперь значительно хуже.", 2);
        lhm18.put("У меня вообще нет аппетита.", 3);
        Question q18 = new Question(lhm18);

        LinkedHashMap<String, Integer> lhm19 = new LinkedHashMap<>();
        lhm19.put("Я не потерял вес или потеря незначительная.", 0);
        lhm19.put("Я потерял более 2 кг.", 1);
        lhm19.put("Я потерял более 5 кг.", 2);
        lhm19.put("Я потерял более 7 кг.", 3);
        Question q19 = new Question(lhm19);

        LinkedHashMap<String, Integer> lhm20 = new LinkedHashMap<>();
        lhm20.put("Я не беспокоюсь о своем здоровье больше, чем обычно.", 0);
        lhm20.put("Меня тревожат проблемы здоровья.", 1);
        lhm20.put("Я очень обеспокоен своим физическим состоянием.", 2);
        lhm20.put("Я настолько обеспокоен своим здоровьем, что больше ни о чем не могу думать.", 3);
        Question q20 = new Question(lhm20);

        LinkedHashMap<String, Integer> lhm21 = new LinkedHashMap<>();
        lhm21.put("В последнее время я не замечал изменений интереса к сексу.", 0);
        lhm21.put("Меня меньше интересуют сексуальные вопросы, чем раньше.", 1);
        lhm21.put("Я значительно меньше интересуюсь сексом.", 2);
        lhm21.put("Я полностью утратил сексуальный интерес.", 3);
        Question q21 = new Question(lhm21);

        BeckDepression beckDepression = new BeckDepression();

        List<Question> questions = List.of(q1, q2, q3, q4, q5,
                q6, q7, q8, q9, q10,
                q11, q12, q13, q14, q15,
                q16, q17, q18, q19, q20,
                q21);

        Scanner scanner = new Scanner(System.in);

        int questionNumber = 1;

        for (Question q : questions) {

            System.out.println("\nВопрос " + questionNumber);

            List<String> answers = q.getAnswersList();

            // вывод вариантов
            for (int i = 0; i < answers.size(); i++) {
                System.out.println((i + 1) + ". " + answers.get(i));
            }

            // ввод пользователя
            int choice;
            while (true) {
                System.out.print("Выберите вариант (1-4): ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= answers.size()) {
                    break;
                } else {
                    System.out.println("Некорректный ввод, попробуйте снова.");
                }
            }

            // получаем выбранный ответ
            String selectedAnswer = answers.get(choice - 1);

            // добавляем score
            beckDepression.answer(q, selectedAnswer);

            questionNumber++;
        }

        // итог
        System.out.println("\nРезультат: " + beckDepression.getResult());
    }
}