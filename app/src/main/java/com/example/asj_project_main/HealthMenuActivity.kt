package com.example.asj_project_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asj_project_main.databinding.ActivityDetailBinding.inflate
import com.example.asj_project_main.databinding.ActivityHealthMenuBinding
import com.example.asj_project_main.databinding.ActivityHealthMenuBinding.inflate
import com.example.asj_project_main.databinding.ViewBinding.inflate

class HealthMenuActivity : AppCompatActivity(), healthclicklistener {
    private lateinit var binding: ActivityHealthMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        healthcareinfo()
        val mainact = this
        binding.myView.apply{
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = Adapter(healthcareList,mainact)
        }
    }

    override fun onClick(healthcare: healthcare) {
        val intent = Intent(applicationContext,DetailActivity::class.java)
        intent.putExtra(HEALTH_EXTRA,healthcare.id)
        startActivity(intent)
    }

    private fun healthcareinfo() {
        val health1 = healthcare(
            R.drawable.ic_exercise,
            "Exercise Tips",
            "What are the benefits of exercise for older adults? \n" +
                    "There are many reasons why we tend to slow down and become more sedentary with age. It may be due to health problems, weight or pain issues, or worries about falling.\n" +
                    " Or perhaps you think that exercising simply isn’t for you. But as you grow older, an active lifestyle becomes more important than ever to your health. \n" +
                    "Getting moving can help boost your energy, maintain your independence, protect your heart, and manage symptoms of illness or pain as well as your weight. Regular exercise is also good for your mind, mood, and memory. \n" +
                    "It’s never too late to find simple, enjoyable ways to become more active, improve your mood and outlook, and reap all of the physical and mental health benefits of exercise. \n\n" +
                    " - Physical health benefits of exercise - \n" +
                    "1. Reduce the impact of illness and chronic disease. People who exercise tend to have improved immune and digestive functioning, better blood pressure and bone density, and a lower risk of Alzheimer’s disease, diabetes, obesity, heart disease, osteoporosis, and certain cancers.\n" +
                    "2. Enhance your mobility, flexibility, and balance. Exercise improves your strength, flexibility, and posture, which in turn can help with your balance and coordination, and reduce your risk of falls.\n" +
                    "3. Boost your mood and self-confidence. Exercise is a huge stress reliever and the endorphins produced can actually help reduce feelings of sadness, depression, and anxiety. Being active and feeling strong can also help you feel more self-confident.\n" +
                    "4. Improve your brain function Activities like Sudoku or crossword puzzles can help keep your brain active, but little comes close to the beneficial effects of exercise on the brain.\n\n" +
                    "What if you hate to exercise? \n" +
                    "Think about activities that you enjoy and how you can incorporate them into an exercise routine:\n" +
                    "i) Take photographs on a nature hike.\n" +
                    "ii) Watch a favorite movie or TV show while walking on the treadmill.\n" +
                    "iii) Go for a run, walk, or cycle when you’re feeling stressed—see how much better you feel afterwards \n\n"
        )
        healthcareList.add(health1)

        val health2 = healthcare(
            R.drawable.ic_diet,
            "Dietary Plans and Information",
            "Eating a well-balanced diet is an important part of staying healthy as you age. It can help you maintain a healthy weight, stay energized, and get the nutrients you need. It also lowers your risk of developing chronic health conditions, such as heart disease and diabetes.\n" +
                    " It’s never too late to get healthy and improve your quality of life. For some older adults this means maintaining or reaching a healthy weight \n" +
                    "In general, weight loss is not recommended as it already occurs within 15% to 20% of all elderly adults and it can increase the risk for morbidities and mortality. \n\n" +
                    "Diet do's and don't\n" +
                    "-  Add plenty of natural colour to your diet. Two to three meals of seasonal fruits will work as antioxidants and prevent constipation.\n" +
                    "- Egg whites are a good source of protein important for repair of worn out cells and tissues.\n" +
                    "- Vegetables soups without cream and thickening agents are a healthy meal to be taken as a supper.\n" +
                    "- Drink about 15 glasses of water in a day to prevent dehydration. In old age, muscle density reduces and susceptibility to dehydration is always very high, especially in summer.\n" +
                    "- Avoid processed foods with artificial colours and preservatives.\n\n" +
                    "As you age, you may not notice when you’re thirsty. Make sure you’re drinking fluids on a regular basis.\n\n"
        )
        healthcareList.add(health2)
        val health3 = healthcare(
            R.drawable.ic_mentalhealth,
            "Mental Health",
            "Old age is a natural phenomenon and comes with its own set of challenges.  As the elder population is increasing, their traditional nurturing and life-sustaining influences are slowly becoming less effective. Depression, dementia, and anxiety are commonly seen in old age and have an effect on senior’s mental health and well-being.\n" +
                    "Older adults, those aged 60 or above, make important contributions to society as family members, volunteers and as active participants in the workforce.\n" +
                    " While most have good mental health, many older adults are at risk of developing mental disorders, neurological disorders or substance use problems as well as other health conditions such as diabetes, hearing loss, and osteoarthritis\n" +
                    "\n" +
                    "Causes for Senior Mental Illness:\n" +
                    "One of the continuing problem with diagnosis and treatment of mental illness in elderly people is that they are more likely to report physical symptoms than psychiatric complaints.\n\n" +
                    "Symptoms of Mental Illness:\n" +
                    "There are numerous warning signs, which could indicate a mental health concern in older people:\n" +
                    "1. Sad or miserable mood lasting longer than two weeks.\n" +
                    "2. Social withdrawal, loss of interest in things that used to be pleasurable.\n" +
                    "3. Unexplained fatigue, energy loss, or sleep alterations.\n" +
                    "4. Confusion, disorientation, problems with concentration or decision-making.\n" +
                    "5. Increase or decrease in hunger, changes in weight.\n" +
                    "6. Memory loss, especially recent or short-term memory problems.\n\n" +
                    "The problem of mental health and the psychiatric problem needs to be tackled with the utmost care and a multidisciplinary approach needs to be followed. Providing a safe community for elders is very much needed in our society, and steps need to be taken to promote physical and mental well-being for the elders of our country.\n" +
                    "\n\n" +
                    "“Each time you set a healthy boundary, you say “yes” to more freedom”-  Nancy Levin\n\n"
        )
        healthcareList.add(health3)
        val health4 = healthcare(
            R.drawable.ic_medical,
            "Medical Informations",
            "Health problems are one of the very common and very important factors which our elder’s face in the second inning of their life.\n" +
                    "Most Common Health issues faced:\n\n" +
                    "1. Arthritis\n" +
                    "The word arthritis is used to describe pain, swelling and stiffness in a joint or joints. Arthritis isn’t a single condition and there are several different types. \n" +
                    "Osteoarthritis (OA) is the most common type of arthritisTrusted Source,  Other common typesTrusted Source include:\n" +
                    "\n\n" +
                    "Symptoms:\n" +
                    "* clicking or popping with bending\n" +
                    "* muscle weakness around the joint\n" +
                    "* instability or buckling of the joint\n" +
                    "* bony growths in the fingers\n\n" +
                    "What causes Arthritis?\n" +
                    "age (OA is most common in adults over age 50), obesity, autoimmune disorders, genes or family history, muscle weakness\n\n\n" +
                    "2. Heart Disease\n" +
                    "Heart Disease\n" +
                    "According to the CDC, heart disease remains the leading killer of adults over age 65, accounting for 489,722 deaths in 2014. As a chronic condition, heart disease affects 37 percent of men and 26 percent of women 65 and older\n" +
                    "\n\n" +
                    "Symptoms:\n" +
                    "* Chest pain, chest tightness, chest pressure and chest discomfort (angina)\n" +
                    "* Shortness of breath\n" +
                    "* Pain, numbness, weakness or coldness in your legs or arms if the blood vessels in those parts of your body are narrowed\n" +
                    "* Pain in the neck, jaw, throat, upper abdomen or back\n\n" +
                    "Causes:\n" +
                    "Heart disease causes depend on your specific type of heart disease. There are many different types of heart disease, Make sure to visit a doctor if you witness theses symptoms\n" +
                    "\n\n" +
                    "3. Cancer\n" +
                    "Cancer is the second leading cause of death among people over age 65, with 413,885. If caught early through screenings, such as mammograms, colonoscopies, and skin checks, many types of cancer are treatable. And though you're not always able to prevent cancer, you can improve your quality of life as a senior living with cancer\n\n" +
                    "Symptoms:\n" +
                    "Here are some of the more common signs and symptoms that may be caused by cancer. However, any of these can be caused by other problems as well.\n" +
                    "\n" +
                    "* Fatigue or extreme tiredness that doesn’t get better with rest.\n" +
                    "* Weight loss or gain of 10 pounds or more for no known reason\n" +
                    "* Eating problems such as not feeling hungry, trouble swallowing, belly pain, or nausea and vomiting\n" +
                    "* Swelling or lumps anywhere in the body\n" +
                    "* Thickening or lump in the breast or other part of the body\n" +
                    "* Change in bowel habits, such as constipation or diarrhea, that doesn’t go away or a change in how your stools look\n" +
                    "* Bladder changes such as pain when passing urine, blood in the urine or needing to pass urine more or less often\n" +
                    "\n\n" +
                    "4. Amnesia\n" +
                    "Amnesia is a form of memory loss.\n" +
                    "\n" +
                    "Some people with amnesia have difficulty forming new memories. Others can’t recall facts or past experiences. People with amnesia usually retain knowledge of their own identity in addition to their motor skills.\n" +
                    "\n" +
                    "Mild memory loss is a normal part of aging.\n\n" +
                    "Symptoms:\n" +
                    "* difficulty recalling facts, events, places, or specific details (which can range from what you ate this morning to the name of the current president)\n" +
                    "* an impaired ability to learn new information\n" +
                    "* confusion\n" +
                    "* an inability to recognize locations or faces\n\n\n" +
                    "5. Diabetes\n" +
                    "Diabetes is a chronic (long-lasting) health condition that affects how your body turns food into energy.,If you have diabetes, your body either doesn’t make enough insulin or can’t use the insulin it makes as well as it should.\n" +
                    "There isn’t a cure yet for diabetes, but losing weight, eating healthy food, and being active can really help.\n\n" +
                    "Symptoms:\n" +
                    "* Are very hungry\n" +
                    "* Have blurry vision\n" +
                    "* Have numb or tingling hands or feet\n" +
                    "* Feel very tired\n" +
                    "* Have very dry skin\n" +
                    "* Have sores that heal slowly\n" +
                    "* Have more infections than usual\n\n\n" +
                    "For more enquiries always visit a doctor and get the best medication and treatment prescribed.\n"
        )
        healthcareList.add(health4)
        val health5 = healthcare(
            R.drawable.ic_outdoor,
            "Outdoor Activities",
            "Why Should Seniors Engage in Outings?\n" +
                    "Many seniors tend to stay indoors due to their physical limitations or lifestyle changes. Getting out and about with a wheelchair can seem like a tremendous burden, and a lack of a regular job erases any essential need to get outside regularily.\n" +
                    "\n" +
                    "However, remaining at home – often alone – can contribute to ailing health, depression, and memory loss. \n" +
                    "Outdoor Activities for Seniors\n" +
                    "Now that you know how to prepare for an outdoor activity with seniors, let’s look at some of the best places to go. \n" +
                    "\n"+"1. Shopping\n" +
                    "Taking a walk around the mall and window shopping can be quite enjoyable. Malls typically have plenty of benches where you or an older adult can rest if they need to. \n" +
                    "\n"+"2. Bird Watching\n" +
                    "If you want to avoid uneven ground and walkways, try bird watching.There are many avid older birders, so birding can prove to be a good socializing activity as well\n" +
                    "\n"+"3. Gardening\n" +
                    "Gardening can make a good exercise or a simple form of relaxation. It maintains their flexibility, strength, and allows them to stay active. Moreover, gardening of crops can even be a fruitful source of food.\n" +
                    "\n"+"4. Golf\n" +
                    "Golf is known as a good and entertaining way to spend time outdoors. It is also a relaxing activity for some, and it helps them improve their coordination. It might look like a simple sport, but golfing also provides light exercises that every senior needs.\n" +
                    "\n"+"5. Picnic\n" +
                    "A picnic, however elaborate or simple it might be, is a good way to bask under the sun and soak up that much-needed Vitamin D. It is also a form of social activity that will allow seniors to have conversations with their friends, or even caregivers.\n\n"
        )
        healthcareList.add(health5)
        val health6 = healthcare(
            R.drawable.ic_covid_19,
            "Information on Covid-19",
            "What is Covid - 19? \n" +
                    "Coronavirus disease (COVID-19) is an infectious disease caused by the SARS-CoV-2 virus.The virus can spread from an infected person’s mouth or nose in small liquid particles when they cough, sneeze, speak, sing or breathe.\n" +
                    "\n" +
                    "-- Symptoms\n" +
                    "Most common symptoms:\n" +
                    "fever\n" +
                    "cough\n" +
                    "tiredness\n" +
                    "loss of taste or smell.\n\n" +
                    "Less common symptoms:\n" +
                    "sore throat\n" +
                    "headache\n" +
                    "aches and pains\n" +
                    "diarrhoea\n" +
                    "a rash on skin, or discolouration of fingers or toes\n" +
                    "red or irritated eyes.\n\n" +
                    "-- Prevention\n" +
                    "# Get vaccinated when a vaccine is available to you.\n" +
                    "# Stay at least 1 metre apart from others, even if they don’t appear to be sick.\n" +
                    "# Wear a properly fitted mask when physical distancing is not possible or when in poorly ventilated settings.\n" +
                    "# Choose open, well-ventilated spaces over closed ones. Open a window if indoors.\n" +
                    "# Wash your hands regularly with soap and water or clean them with alcohol-based hand rub.\n" +
                    "# Cover your mouth and nose when coughing or sneezing.\n" +
                    "# If you feel unwell, stay home and self-isolate until you recover.\n" +
                    "Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. \n\n\n" +
                    "STAY SAFE AND TAKE CARE! \n"
        )
        healthcareList.add(health6)
    }
}